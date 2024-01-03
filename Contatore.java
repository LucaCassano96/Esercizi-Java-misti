public class Contatore {

    //VARIABILI DI ISTANZA
    int conteggio;


    //GETTER
    public int getConteggio(){
        return conteggio;
    }

    //METODI

    private int conteggioPartenza(){
        conteggio = 0;
        return conteggio;
    }

    public int incrementoConteggio(){
        return ++conteggio;
    }

    public int decrementoConteggio(){

        conteggio--;

        if (conteggio < 0) {
            conteggio = conteggioPartenza();
        }
        return conteggio;
    }

    public void valoreCorrenteContatore(){

        System.out.println("valore corrente conteggio " + conteggio);
    }

    public static class BarcaMotore {

        // VARIABILI DI ISTANZA
        private int fuelCapacity;
        private int fuelQuantity;
        private int maxSpeed;
        private int currentSpeed;
        private int engineEfficenty;
        private int distance;


        //GETTER E SETTER
        public int getFuelCapacity() {
            return fuelCapacity;
        }

        public void setFuelCapacity(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelQuantity() {
            return fuelQuantity;
        }

        public void setFuelQuantity(int fuelQuantity) {
            this.fuelQuantity = fuelQuantity;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public int getCurrentSpeed(){
            return currentSpeed;
        }

        public void setCurrentSpeed(int currentSpeed){
            this.currentSpeed = currentSpeed;
        }

        public int getEngineEfficenty() {
            return engineEfficenty;
        }

        public void setEngineEfficenty(int engineEfficenty) {
            this.engineEfficenty = engineEfficenty;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        // METODI

        public void speed(int increseVelocity){
            currentSpeed += increseVelocity;
            if (currentSpeed >= maxSpeed) {
                currentSpeed = maxSpeed;
            }
            System.out.println("la tua velocità è " + currentSpeed );
        }

        public void fuel(int increseFuel){

            fuelQuantity += increseFuel;

            if (fuelQuantity >= fuelCapacity) {
                fuelQuantity = fuelCapacity;
                System.out.println("il tuo serbatoio è pieno " + fuelQuantity +  " litri");
            }

            if (fuelQuantity == 0) {
                System.out.println("la barca è ferma");
            }

            System.out.println("il tuo serbatoio ha " + fuelQuantity +  " litri");
        }

        public void distance(int tempo){

            if (currentSpeed > maxSpeed) {
                currentSpeed = maxSpeed;
            }

            int distance = currentSpeed * tempo;
            System.out.println("La distanza percorsa è " + distance);
        }
    }
}
