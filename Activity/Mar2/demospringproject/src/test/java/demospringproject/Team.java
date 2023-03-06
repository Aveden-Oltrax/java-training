/**
 * 
 */
package demospringproject;

import org.springframework.stereotype.Component;

/**
 * @author 158417
 *
 */

@Component("Team")
public class Team {
	public void show() {
		System.out.println("Team Found");
	}
}
