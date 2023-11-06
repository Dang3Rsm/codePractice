import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myOOPS {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        System.out.println("__STARTED__");

        Car mycar = new Car("SANJEEV KU MISHRA","TATA","SUMO",2016, 7);
        Car mycar2 = new Car("REETA RANI","AUDI","R8",2020, 2);
        mycar.carStartWav = "car-engine-starting-SUMO.wav";
        mycar2.carStartWav = "car-engine-starting-R8.wav";
        mycar.speed(100);
        mycar2.speed(120);

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run){
            System.out.println("q to exit");
            System.out.printf("Which car you want to enter and start? (%s,%s): ",mycar.getCar_name(),mycar2.getCar_name());
            System.out.println();
            String select_car = sc.next();
            switch (select_car){
                case "R8":
                    mycar2.startEngine();
                    break;
                case "SUMO":
                    mycar.startEngine();
                    break;
                case "q":
                    run = false;
                    break;
                default:
                    System.out.println("CANNOT START!");
                    run = false;
            }
        }
    }
}


class Car {
    public String carStartWav;
    private String car_owner;
    private String car_company;
    private String car_name;
    private int car_model_year;
    private int car_seater;
    private int max_speed;

    String car_info;

    public Car(String car_owner, String car_company,String car_name, int car_model_year, int car_seater){
        this.car_owner = car_owner;
        this.car_company = car_company;
        this.car_name = car_name;
        this.car_model_year = car_model_year;
        this.car_seater = car_seater;
        this.car_info = "car owner: " + car_owner + " car company: " + car_company + " car name:" + car_name + " car model year " + car_model_year + " car seater " + car_seater;


        System.out.println(car_info);
    }

    public String getCar_name(){
        return this.car_name;
    }
    public void startEngine() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File(this.carStartWav);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        System.out.println(this.car_name+" STARTED VROOM VROOM!");
        clip.start();
    }

    public void speed(int maxSpeed) {
        this.max_speed = maxSpeed;
    }

}
