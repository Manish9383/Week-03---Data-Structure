package singly_linkedlist.social_media;

public class SocialNetwork {
    private User head;

    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        newUser.next = head;
        head = newUser;
    }

    public User searchByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) return temp;
            temp = temp.next;
        }
        return null;
    }

    public User searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userID1, int userID2) {
        User user1 = searchByID(userID1);
        User user2 = searchByID(userID2);

        if (user1 != null && user2 != null && userID1 != userID2) {
            if (!user1.friendIDs.contains(userID2)) user1.friendIDs.add(userID2);
            if (!user2.friendIDs.contains(userID1)) user2.friendIDs.add(userID1);
        }
    }

    public void removeFriendConnection(int userID1, int userID2) {
        User user1 = searchByID(userID1);
        User user2 = searchByID(userID2);

        if (user1 != null && user2 != null) {
            user1.friendIDs.remove(Integer.valueOf(userID2));
            user2.friendIDs.remove(Integer.valueOf(userID1));
        }
    }

    public void displayFriends(int userID) {
        User user = searchByID(userID);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIDs);
        } else {
            System.out.println("User not found.");
        }
    }

    public void findMutualFriends(int userID1, int userID2) {
        User user1 = searchByID(userID1);
        User user2 = searchByID(userID2);

        if (user1 != null && user2 != null) {
            System.out.print("Mutual Friends: ");
            for (int friendID : user1.friendIDs) {
                if (user2.friendIDs.contains(friendID)) {
                    System.out.print(friendID + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void countFriends(int userID) {
        User user = searchByID(userID);
        if (user != null) {
            System.out.println(user.name + " has " + user.friendIDs.size() + " friend(s).");
        } else {
            System.out.println("User not found.");
        }
    }

    public void displayUsers() {
        User temp = head;
        while (temp != null) {
            temp.displayUser();
            temp = temp.next;
        }
    }
}
