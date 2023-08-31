import java.util.ArrayList;
import java.util.HashMap;

public class Bill {
    private CarService carService;

    private ArrayList<String> serviceCodes;

    private StringBuilder sb = new StringBuilder();

    private int sum = 0;

    Bill(CarService carService , ArrayList<String> serviceCodes){
        this.carService = carService;
        this.serviceCodes = serviceCodes;
    }


    public int calculateBill(){
        if(carService instanceof SUV){
            for(String str : serviceCodes){
                sb.append("Charges for "+carService.getServicePrices().get(str).service + " -- ₹ "+carService.getServicePrices().get(str).price);
                sb.append("\n");
                sum+= carService.getServicePrices().get(str).price;

            }
//            sum += carService.basicService();
        }else if(carService instanceof Hatchback){
            for(String str : serviceCodes){
               sb.append("Charges for "+carService.getServicePrices().get(str).service + " -- ₹ "+carService.getServicePrices().get(str).price);
               sb.append("\n");
               sum+= carService.getServicePrices().get(str).price;
            }

        }else if(carService instanceof Sedan){
            for(String str : serviceCodes){
                sb.append("Charges for "+carService.getServicePrices().get(str).service + " -- ₹ "+carService.getServicePrices().get(str).price);
                sb.append("\n");
                sum+= carService.getServicePrices().get(str).price;
            }

        }

        return sum;
    }

    @Override
    public String toString(){
        if(sum>10000){
            sb.append("Charges for complimentary cleaning (FREE) -- ₹ 0").append("\n");
        }
        sb.append("Total Bill -- ₹ "+ sum );
        return sb.toString();
    }
}
