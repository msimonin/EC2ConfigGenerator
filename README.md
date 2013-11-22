EC2ConfigGenerator
==================

XML generator for EC2 API requests and responses.

## Examples

Generates response to the DescribeAdressesResponse Action (see all supported actions here : http://docs.aws.amazon.com/AWSEC2/2010-11-15/APIReference/)

```java
DescribeAddressesResponseType addresses = new DescribeAddressesResponseType();

DescribeAddressesResponseInfoType addressesResponseInfo = new DescribeAddressesResponseInfoType();
List<DescribeAddressesResponseItemType> addressesInfo = addressesResponseInfo.getItem();
DescribeAddressesResponseItemType addressItem = new DescribeAddressesResponseItemType();
addressesInfo.add(addressItem);
addresses.setAddressesSet(addressesResponseInfo);

addressItem.setInstanceId("myinstanceid");
addressItem.setPublicIp("10.135.58.1");
```

## Using with RESTlet

You will need to create an Jaxb representation of the response : 

```java
// set representation
ObjectFactory objectFactory = new ObjectFactory();
JAXBElement<DescribeAddressesResponseType> elementResponse =
        objectFactory.createDescribeAddressesResponse(addresses);
JaxbRepresentation<JAXBElement<DescribeAddressesResponseType>> responseRepresentation =
        new JaxbRepresentation<JAXBElement<DescribeAddressesResponseType>>(elementResponse);
```

The `responseRepresentation` can be returned as an xml reprentation.

## Maven

This project is managed with maven. Add this line to your pom.xml : 

```xml
<repository>
    <id>snooze repository releases</id>
    <name>snooze repo</name>
    <url>http://snooze.inria.fr/maven/releases</url>
</repository>
```


```xml
<dependency>
   <groupId>com.amazonaws.ec2.doc._2010_08_31</groupId>
   <artifactId>EC2configGenerator</artifactId>
   <version>0.0.1</version>
</dependency>
```
