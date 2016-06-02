package webapp.core;

import ml.algorithms.MLAlgorithm;
import ml.algorithms.MLAlgorithmFactory;

/**
 * @author rchandavaram
 *Core class to run algorithm on request and fix input or handle request based on attack type.
 */
public class WebappSecurity {
	private Object request;
	public WebappSecurity(Object request) {
		this.request = request;
	}
	public void run(){
		MLAlgorithm algo = MLAlgorithmFactory.getAlgorithm();
		algo.execute();
		if(algo.attackIdentified()){
			algo.getPossibleAttack().sterilize(request);
		}
	}
}
