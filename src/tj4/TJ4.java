package tj4;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;



/**
 *
 * @author gallegomanuel
 */
public class TJ4 {

    public static void main(String[] args) throws TwitterException {
        Twitter miTwitter = new TwitterFactory("twitter4j.properties").getInstance();
        Status miStatus = miTwitter.updateStatus("Holi");
        System.out.println(miStatus.getText());
    }
    
}
