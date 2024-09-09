package hw0;
/**
 * Implements ZapsWithSlimes interface
 * 
 * @author William Goble
 * @author Dickinson College
 * @version January 2024
 *
 */

 public class SpaceAlienExtension extends SpaceAlien implements ZapsWithSlime {
    String newHome;
    public SpaceAlienExtension(String homePlanet, double distanceFromEarth, String newHome) {
        super(homePlanet, distanceFromEarth);
        this.newHome = newHome;
    }

    @Override
    public String doSlimeZap(int numHumans) {
        return "Hehe you have killed " + numHumans;
    }

    @Override
    public String slimeWholeEarth() {
        return "HAHAHAHAHAH";
    }
    
    @Override
    public void doGreeting() {
        System.out.println("Greetings I am now in" + newHome);
    }
    

 }