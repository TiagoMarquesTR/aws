
package aws.sdk;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;

public class AWSS3App {

    public static void main(String[] args) {

        String accessKey = "XXXXXXXXXXXXXXXXXXXX";
        String secretKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey,
                secretKey);

        AmazonS3 s3 = AmazonS3ClientBuilder
                .standard()
                .withCredentials(
                        new AWSStaticCredentialsProvider(awsCredentials))
                .withRegion(Regions.SA_EAST_1).build();

        System.out.println("Listing buckets...");
        List<Bucket> listBuckets = s3.listBuckets();
        for (Bucket bucket : listBuckets) {
            System.out.println(bucket.getName());
        }
    }
}
