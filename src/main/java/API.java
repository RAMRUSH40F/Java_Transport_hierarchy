public class API {
    public static void main(String[] args) {

        /* TEST src.main.java.Engine CLASS */
        Engine LexusRT20 = new Engine.Builder()
                .name("LexusRT20")
                .force_power(600)
                .started(false)
                .build();
    /*
        LexusRT20.start();
        LexusRT20.info();
        LexusRT20.stop();
    */

        /* TEST src.main.java.Machine CLASS */

    /*    src.main.java.Machine tank = new src.main.java.Machine.Builder()
                .fuel(50)
                .name("Panther 3")
                .engine_name("RV-100")
                .force_power(6000)
                .build();

        tank.info();
        tank.fill(50);
        tank.start();
        tank.info();
    */


        /* TEST src.main.java.CruiseShip CLASS */

        CruiseShip Victoria = new CruiseShip.Builder()
                    .numPeople(0)
                    .location("San-francisco")
                    .tonnage(12000)
                    .name("Victoria")
                    .maximumDistance(500)
                    .engine_name("RPV-50")
                    .force_power(600)
                    .build();
    /*
            Victoria.info();
            Victoria.fill(150);
            Victoria.getOnBoard(25);
            Victoria.getOffBoard(30);

            Victoria.getOnBoard(50);
            Victoria.sail("New-York");
    */
        /* TEST src.main.java.Public_transport CLASS */

        Public_transport Bus = new Public_transport.Builder()
                .numPeople(0)
                .location("Leninskiy_avenue")
                .tonnage(12000)
                .name("Bus")
                .maximumDistance(500)
                .engine_name("Volga-530")
                .force_power(600)
                .fuelConsumption(30)

                .build();

//        Bus.info();
//        Bus.fill(150);
//        Bus.getOnBoard(25);
//        Bus.getOffBoard(30);

//        Bus.getOnBoard(50);

        // Test src.main.java.Machine hashcode, equals, toString methods.
        Machine Tank = new Machine.Builder()
                .fuel(50)
                .name("Panther 3")
                .engine_name("RV-100")
                .force_power(6000)
                .build();
        System.out.println(Machine.getHealthPoint());
        System.out.println(Machine.getNumOfInstances());
//        System.out.println(Tank == Bus);
//        System.out.println(Bus);
//        System.out.println(Tank.getId());
//        System.out.println(Bus.getId());

    }


}

