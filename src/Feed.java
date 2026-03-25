import java.util.ArrayList;

public class Feed {
    public static void main(String[] args) {
          // Step 1: Create your ArrayList to hold post descriptions
        ArrayList<String> feed = new ArrayList<String>();

        // Step 2: Add 7 post descriptions using .add()
        // Example: feed.add("Maya posted a photo");

        feed.add("Maya posted a photo.");
        feed.add("Jared posted a reel.");
        feed.add("Donald added to his story");
        feed.add("Darnell sent you a message.");
        feed.add("Scrimbuldbop has blocked you.");
        feed.add("Tyrell added to his story.");
        feed.add("Dramaminer posted a reel.");
        // Step 3: Print only the FIRST 3 posts (the top of the feed)
        // Use a for loop — think carefully about when your loop should stop
        for (int i = 0; i<4; i++){
            System.out.println(feed.get(i));

        }
        
        // Step 4: Print how many posts are still waiting below the top 3
        System.out.println((feed.size()-3) + " more posts below...");

    }
}
