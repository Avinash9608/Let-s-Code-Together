package CodeToGether;

public class CheckOxygenLevel {
    public static void main(String[] args) {
        int arr[]={95,92,95,92,90,92,90,92,90};
        int[] res=new int[3];
        for (int i=0;i< arr.length;i=i+3)
        {
            res[0]+=arr[i];
            res[1]+=arr[i+1];
            res[2]+=arr[i+2];
        }

        if(res[0]==res[1])
        {
            System.out.println("Trainee Number "+1);
            System.out.println("Trainee Number "+2);
        } else if (res[0]==res[2]) {
            System.out.println("Trainee Number "+1);
            System.out.println("Trainee Number "+3);
        } else  {
            if(res[0]>res[1] && res[0]>res[2] && res[0]>70)
            {
                System.out.println("Trainee Number"+1);
            } else if (res[1]>res[0] && res[1]>res[2] && res[1]>70) {
                System.out.println("Trainee Number"+2);
            } else if (res[2]>res[0] && res[2]>res[0] && res[2]>70) {
                System.out.println("Trainee Number"+3);
            }else
            {
                System.out.println("All trainees are unfit");
            }
        }
    }
}
