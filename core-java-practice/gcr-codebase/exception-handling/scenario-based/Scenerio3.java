class Scenerio3 {

    static int getSeat(int index) {

        int[] seats = {101, 102, 103, 104, 105};

        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Seat Position");
            return -1;
        }
    }

    public static void main(String[] args) {

        int seat = getSeat(8);

        System.out.println(seat);
    }
}