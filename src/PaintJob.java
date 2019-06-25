public class PaintJob {

    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets ){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        double square = width*height;
        int fullbucketsCover =(int)(square/areaPerBucket);
        if(square%areaPerBucket !=0){
            fullbucketsCover++;
        }
        int returnRemainderBuckets = fullbucketsCover-extraBuckets;


        System.out.println(returnRemainderBuckets);
        return returnRemainderBuckets;

    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0 ){
            return -1;
        }
        double square = width*height;
        int fullbucketsCover =(int)(square/areaPerBucket);
        if(square%areaPerBucket !=0){
            fullbucketsCover++;
        }
        int returnRemainderBuckets = fullbucketsCover;


        System.out.println(returnRemainderBuckets);
        return returnRemainderBuckets;

    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0  || areaPerBucket<=0 ){
            return -1;
        }
        double square = area;
        int fullbucketsCover =(int)(square/areaPerBucket);
        if(square%areaPerBucket !=0){
            fullbucketsCover++;
        }
        int returnRemainderBuckets = fullbucketsCover;


        System.out.println(returnRemainderBuckets);
        return returnRemainderBuckets;

    }

}
