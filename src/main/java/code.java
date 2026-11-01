import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        int sceneChoice;
        Scanner keyboard = new Scanner(System.in);   
        System.out.print("WELCOME TO THE ULTIMATE CHOOSE YOUR OWN ADVENTURE GAME!\nChoose 1 to be stuck in a desert.");
        sceneChoice = keyboard.nextInt();
        
        if (sceneChoice == 1) {
            Desert();
        }
        else {
            System.out.println("Invalid choice. Please restart the game and choose a valid option.");
        }
        keyboard.close();
    }


    
    public static void Desert() {
        System.out.println("You are stuck in a desert, on the verge of dehydration and you're famished from trying to escape the scathing landscape. You see a cactus in the distance (1) and a small animal running across the sand (2). What do you do?");
        int waterOrFood = new Scanner(System.in).nextInt();
        if (waterOrFood == 1) {
            System.out.println("You approach the cactus and find some water. You drink it and begin to feel woozy. Immediately, you think you are in a lush forest.\nYou survived but now you are hallucinating on catus juice");
            System.out.println("The hallucinations are so strong that you cannot tell what is real and what is not. You wander around the desert, falsely following mirages. You travel and see (or possibly hallucinate) a pack of food, tied up in a cloth (1) and you see a group of people in the distance (2). What do you do?");
            int foodOrPeople = new Scanner(System.in).nextInt();
            if (foodOrPeople == 1) {
                System.out.println("You approach the food and find out that it is actually a rock. You trip over it and sprain your ankle, left on the verge of death\nHowever, there is still hope - if you can find a way to travel around the desert.");
                System.out.println("You crawl across the desert, getting sand everywhere. You create a splint with a stick, and you are able to limp your way to a path. You are glad to see a real trail, however, there is a fork in the road\nOne path looks almost wet and muddy (1), while the other one has a lot of rocks, footprints, and strangely, some holes(2).");
                int pathChoice = new Scanner(System.in).nextInt();
                if (pathChoice == 1) {
                    System.out.println("You follow the wet and muddy path, but it is actually filled with quicksand. You sink deeper and deeper and accept your fate. You did not survive.");    
            }
            else if (pathChoice == 2) {
                    System.out.println("You follow the path with rocks, footprints, and holes. You carefully navigate through the path, avoiding the holes (which are filled with snakes, you soon find out) and following the footprints. Eventually, you find a small oasis with fresh water and food. You survived!");
                }
            }
            else if (foodOrPeople == 2) {
                System.out.println("You approach the group of people and they offer you food and water. You accept their help and they take you to a safe place where you can recover from your ordeal. Your hallucinations, although they didn't help initially, helped you find your way. You survived!");
            }
        }        
        else if (waterOrFood == 2) {
            System.out.println("You chase the small animal, but it runs away, leaving you more dehydrated than before. A few minutes later, you see a pack of animals rushing towards you. Apparently, the little animal you chased was a baby of the pack. You are now surrounded by a pack of wild animals and they attack you. You did not survive.");
        }
        
    }
}
