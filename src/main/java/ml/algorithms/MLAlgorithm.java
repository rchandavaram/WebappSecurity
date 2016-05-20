package ml.algorithms;

import webapp.attack.Attack;

/**
 * @author rchandavaram
 * Interface for implementing various machine learning algorithms on give input to find out possible attacks.
 */
public interface MLAlgorithm {
	/**
	 * Implementation class should implement any machine learning algorithm to find out all attacks possible from the request.
	 */
	public void execute();
	
	/**
	 * @return true if there is any attack identified.
	 */
	public boolean attackIdentified();
	
	/**
	 * @return attack which was first identified. Eg: XSSAttack
	 */
	public Attack getPossibleAttack();
}
