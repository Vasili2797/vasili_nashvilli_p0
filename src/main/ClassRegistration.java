package main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassRegistration {

    public ClassRegistration() throws IOException {
        System.out.println("Thank you for choosing class registration."
                + "\nPlease pick a class you would like to join!");
        System.out.println("1)Mathematics\n2)English\n3)Chemistry\n4)Programming");
        Scanner scan = new Scanner(System.in);
        int classScan = scan.nextInt();
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //ArrayList<BufferedReader> classes = new ArrayList<>();
        ArrayList<Integer> classes = new ArrayList<>();
        Boolean isOn = true;
        while(isOn) {
            classes.add(classScan);
            if(classScan==0){
                System.out.println(classes);
                isOn=false;
                continue;
            }
        }
        //Boolean isOn = true;
        //if(isOn && !(input == null)) {
        //  //classes.add(input);
        // System.out.println(classes);

    }
        /*for(BufferedReader a : classes){
            System.out.println(a);
        }
        /*Socket socket = new Socket();
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String end;
        ArrayList<BufferedReader> newClasses = new ArrayList<>();
        try {
            socket.connect(new InetSocketAddress(data.host,11355),1000);
            while ((end=input.readLine())!=null ) {
                System.out.println(input);
                newClasses.add(input);
            }

        //reader.close();
            System.out.println(input);
        }catch (IOException ioe){
            System.out.println(ioe.getStackTrace());
        }

        /*System.out.println("Categories:" +
                "\n1)Mathematics"+
                "\n2)English"+
                "\n3)Introduction to Programming");
        String[] strArr = new String[]{"Mathematics", "English", "Introduction to Programming"};

        /*
        for(String s : strArr){
            if (s.equals("Mathematics")){
                System.out.println("You are now registered for the upcoming mathematics course in room 101");
            }else if(s.equals("English")){
                System.out.println("You are now registered for the upcoming English course in room 105");
            }else if(s.equals("Introduction to Programming")){
                System.out.println("You are now registered for the upcoming Programming course in room 100");
            }else{
                System.out.println("Sorry we do not offer the course next semester!");
            }
        }*/}