import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);
//        ArrayList<String> arjeqner = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K", "A"));
//        ArrayList<String> mast = new ArrayList<>(Arrays.asList("♦", "♠", "♥", "♣"));
//        ArrayList<String> kalod = new ArrayList<>();
//        ArrayList<String> norKalod = new ArrayList<>();
//
//        for(String i: mast){
//            for(String j: arjeqner){
//                kalod.add(i + j);
//            }
//        }
//        while(!kalod.isEmpty()){
//            int randomCardIndex = random.nextInt(0, kalod.size());
//            String randomCard = kalod.get(randomCardIndex);
//            norKalod.add(randomCard);
//            kalod.remove(randomCardIndex);
//        }
//        System.out.print("Mutqagreq xaxacoxneri qanaky: ");
//        int qanak = scan.nextInt();
//        if(qanak * 6 > norKalod.size()){
//            System.out.println("CHI KARELI !!!!!!!");
//        }
//        else {
//            for (int i = 1; i <= qanak; i++) {
//                System.out.printf("\nMutqagreq %d xaxacoxi anuny: ", i);
//                String anun = scan.next();
//                System.out.println();
//                System.out.print(anun);
//                System.out.print(norKalod.subList(0, 6));
//                norKalod.removeAll(norKalod.subList(0, 6));
//            }
//        }

        // ex 69
//        Scanner scan = new Scanner(System.in);
//        int gumar = 0;
//        while (true) {
//            System.out.print("Mutqagreq tariqy:  ");
//            int tariqy = scan.nextInt();
//            if (tariqy == 0) {
//                break;
//            } else if (tariqy <= 2) {
//                continue;
//            } else if (tariqy > 3 && tariqy < 12) {
//                gumar += 14;
//            } else if (tariqy >= 12 & tariqy < 65) {
//               gumar += 18;
//            } else {
//                gumar += 23;
//            }
//
//        }
//
//        System.out.print(gumar);
//  ----------------------------------------------------------------------

//        Random rand = new Random();
//        ArrayList <String> list = new ArrayList<>();
//        String[] s = {"O","P"};
//        while (true){
//            int kopekIndex = rand.nextInt(2); // 1
//            list.add(s[kopekIndex]);
//            if(list.size() >= 3){
//                if(list.get(list.size() -1) == list.get(list.size() -2) &&
//                        list.get(list.size() -1) == list.get(list.size() -3)){
//                    System.out.print(list);
//                break;
//                }
//
//            }
//
//        }
//  ----------------------------------------------------------------------

//
//        Scanner scan = new Scanner(System.in);
//        while(true){
//            System.out.print("Enter char: ");
//            String x = scan.nextLine();
//            if(x.isEmpty()){
//                System.out.println("Finish");
//                break;
//            }
//            else{
//                System.out.println(x);
//            }
//
//        }


//  ----------------------------------------------------------------------


//        ArrayList<String> mylist = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter the text:  ");
//            String text = scan.nextLine();
//            if (text.isEmpty()) {
//                System.out.println(mylist);
//                break;
//            } else {
//                mylist.add(text);
//            }
//        }
//        ArrayList<String> newMyList = new ArrayList<>();
//        for(int i = 0 ; i < mylist.size(); i++){
//            String bufer = "";
//            for(int j = 0 ; j < mylist.get(i).length() ; j++){
//                if (mylist.get(i).charAt(j) == ',' || mylist.get(i).charAt(j) == '.') {
//                    continue;
//                }
//                else{
//                    bufer += mylist.get(i).charAt(j);
//                }
//            }
//            newMyList.add(bufer);
//        }
//        System.out.println(newMyList);
//  ----------------------------------------------------------------------


//        String text = "Narek Love Jox and Any Girls";
//        System.out.println(text.substring(0, text.length() - 10));

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter text: ");
//        String text = scan.nextLine();
//        for(char i:text.toCharArray()){
//            System.out.print(Character.toChars(i + 3));
//        }
//  ----------------------------------------------------------------------
//        Scanner scan = new Scanner(System.in);
//        List<String> mylist = new ArrayList<>();
//        while(true){
//            System.out.print("Enter text:  ");
//            String text = scan.nextLine();
//            if(text.isEmpty()){
//                System.out.println(mylist);
//                break;
//            }
//            else{
//                mylist.add(text.substring(0, text.length() - 1));
//            }
//        }
//  ----------------------------------------------------------------------





  }
}