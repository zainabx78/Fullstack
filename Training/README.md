## Java fundamentals

- Create a new project - put into github repo in folder.
- Maven.
- Change project id to `com.sparta.far`. (far = last name 3 digits. )

In the 


`private` --> only accessible within the class.
`void` --> return type. 


# Unit Testing - 

Need to add the library to pom.xml file:

```xml
 <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.10.0</version>
        </dependency>
    </dependencies>

```

- Make sure to refresh maven!!!

## Code for testing:

```java

 @Test
    @DisplayName("getGreeting, when given a time of 21, returns good evening")
    public void getGreeting_GivenATimeOf21_ReturnsGoodEvening(){
        // Arrange
        int time = 21;
        String expected = "Good Evening!";

        //Act
        String actual = App.getGreeting(time);

        //Assert

        Assertions.assertEquals(expected, actual);

    }

```

Can also write it as:

`Assertions.assertEquals(expected: "Good Evening!", App.getGreeting (timeOfDay: 21));`