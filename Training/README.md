# Java fundamentals

- Create a new project - put into github repo in folder.
- Maven.
- Change project id to `com.sparta.far`. (far = last name 3 digits. )

## Creating the structure:
- In src --> main --> java --> create new package: `com.sparta.zf.refactoring`. 
- Then create a new java class in that package called `App`.
- Same in test folder --> java class called `AppTest`in new package.


`private` --> only accessible within the class.
`void` --> return type. 

## Cleaning up code:

- Highlight the code block and Right click on the code block and press extract, name the extraction. 

## Git.ignore file:

```

# Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*
replay_pid*


```
# Unit Testing - 
- Tests document your code.

### Need to add the library to pom.xml file:

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

`Assertions` is the class and `.assertEquals` is the method.

E.g. :

```java
    @Test
    @DisplayName("getGreeting, when given a time of 14, returns good afternoon")
    public void getGreeting_GivenATimeOf14_ReturnsGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon!", App.getGreeting(14));
    }
```

## Boundary value analysis:

- Test the boundary values e.g. if good morning between 5-11am. test 5, 11. 
- If code fails due to boundary values --> should go to product owner to get clarity e.g. is 12 good morning or afternoon.  


### To test multiple values at once:

- Parametized Tests:


```java

@ParameterizedTest
    @ValueSource(ints = {0, 12, 19, 23})
    @DisplayName("getGreeting, when given a time from 19 to 23, returns good evening ")
    public void getGreeting_GiveATimeFrom19To23_ReturningGoodEvening(int time){
        Assertions.assertEquals("Good Evening!", App.getGreeting(time));
    }

```

- In this code, it automatically uses the integers provided in `valuesource` as the integers it needs to test but we put the variable as `time` - just how the framework works. 
- `@csv source` is same as value source but can specify multiple parameters.

### CSV source:

- Not good to use - hard to maintain and can only see one test so not really well documented. 
- Shouldn't have logic in it. (no loops, arrays etc).

```java

@ParameterizedTest
    @CsvSource ({
            "Good Evening!, 2",
            "Good Morning!, 8",
            "Good Afternoon!, 15",
            "Good Evening, 21"
    })
    @DisplayName("getGreeting, when given a time, returns an appropriate greeting")
    public void givenATime_Greeting_ReturnsAnAppropriateGreeting(String expected, int time){
        Assertions.assertEquals(expected, App.getGreeting(time));

    }

```



