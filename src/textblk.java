public class textblk {
    public static void main (int argc, String [] args) {

        String textBlock = """
                {
                  "senderServiceName": "INSPIRE",
                  "targetDropboxName": "eDMS_Mailins",
                  "classificationString": "Domain/Kingdom/Phylum/Class/Order/Family/Genus/Species",
                  "transferFiles": [
                    {
                      "transferFileS3Bucket": "inspire-edms-s3-bucket",
                      "transferFileS3ObjectPath": "transferfiles/pdf/2345678-INSPIREBI-20210606.pdf"
                    }
                  ]
                }""";

        String concatString = "{\n" +
                              "  \"senderServiceName\": \"INSPIRE\",\n" +
                              "  \"targetDropboxName\": \"eDMS_Mailins\",\n" +
                              "  \"classificationString\": \"Domain/Kingdom/Phylum/Class/Order/Family/Genus/Species\",\n" +
                              "  \"transferFiles\": [\n" +
                              "    {\n" +
                              "      \"transferFileS3Bucket\": \"inspire-edms-s3-bucket\",\n" +
                              "      \"transferFileS3ObjectPath\": \"transferfiles/pdf/2345678-INSPIREBI-20210606.pdf\"\n" +
                              "    }\n" +
                              "  ]\n" +
                              "}";
    }
}
