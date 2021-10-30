package task1;

public class App {
        public static void main (String [] args) {
            Vehicle Hyundai = new Vehicle();
            Engine engine1 = new Engine();
            //Wheel wheel1 = new Wheel();
            //Hyundai.setWheel(wheel1);
            Hyundai.setEngine(engine1);
            Hyundai.go();

            Vehicle Audi = new Vehicle();
            Wheel wheel2 = new Wheel();
            //Engine engine2 = new Engine();
            //Audi.setEngine(engine2);
            Audi.setWheel(wheel2);
            Audi.go();
            //System.out.println(Audi.hashCode()+","+Audi.equals(Audi));

            Vehicle Honda = new Vehicle();
            Engine engine3 = new Engine();
            Wheel wheel3 = new Wheel();
            Honda.setEngine(engine3);
            Honda.setWheel(wheel3);
            Honda.go();
            System.out.println(Honda.hashCode()+","+Honda.equals(Honda));

            Vehicle Volkswagen = new Vehicle();
            //Engine engine4 = new Engine();
            //Wheels wheel4 = new Wheel();
            Volkswagen.setEngine(engine3);
            Volkswagen.setWheel(wheel3);
            Volkswagen.go();
            System.out.println(Volkswagen.hashCode()+","+Volkswagen.equals(Honda));


        }

   }


