package ͣ��ϵͳ;

import java.util.ArrayList;
import java.util.Scanner;

public interface IParking {

    void printParkingAvailabilitySequentialy();

    boolean parkCar(int carType);

    static IParams inputParams() {
        int bigPSpace, mediumPSpace, smallPSpace;
        ArrayList<Integer> parkingPlan = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("������ͣ��ϵͳӵ�еĴ�λ��������һ���������س���");
        bigPSpace = sc.nextInt();
        System.out.println("������ͣ��ϵͳӵ�е��г�λ��������һ���������س���");
        mediumPSpace = sc.nextInt();
        System.out.println("������ͣ��ϵͳӵ�е�С��λ��������һ���������س���");
        smallPSpace = sc.nextInt();
        System.out.println("������������ͣ�ĳ���1/2/3����ÿ����һ���������س�������������0��");
        while(true) {
            int nextCar = sc.nextInt();
            if(nextCar == 1 || nextCar == 2 || nextCar == 3) {
                parkingPlan.add(nextCar);
            }
            else if(nextCar == 0) {
                break;
            }
        }
        return new IParams() {
            @Override
            public int getBigPSpace() {
                return bigPSpace;
            }

            @Override
            public int getMediumPSpace() {
                return mediumPSpace;
            }

            @Override
            public int getSmallPSpace() {
                return smallPSpace;
            }

            @Override
            public ArrayList<Integer> getParkingPlan() {
                return parkingPlan;
            }
        };
    }

}
