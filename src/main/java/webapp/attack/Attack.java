package webapp.attack;

import webapp.core.Request;

/**
 * @author rchandavaram
 * This class represents different types of attacks possible in web application.
 */
public interface Attack {
	/**
	 * @return next attack in the queue. 
	 */
	public Attack getNextAttack();
	
	/**
	 * @param request clean client input.
	 */
	public void sterilize(Request request);
}
