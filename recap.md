## Uses of ApplicationContext in Spring

- ✅ Bean Management – Automatically creates and manages beans defined in XML or annotations.
- ✅ Dependency Injection – Injects dependencies between beans without manual object creation.
- ✅ Resource Handling – Manages file resources like properties files and messages.
- ✅ Event Handling – Supports event-driven programming with ApplicationEvent.
- ✅ AOP (Aspect-Oriented Programming) – Enables cross-cutting concerns like logging and security.
- ✅ Lifecycle Management – Calls initialization (@PostConstruct) and destruction (@PreDestroy) methods.
- ✅ Internationalization (i18n) – Supports multiple languages using MessageSource.

## How Object is created in spring

- Spring will not create an obj reference for all classes we created.
- Obj will be created only to those which are listed on the specified xml file.
- Id we will give to the bean on the xml should be unique but we can create more obj for same class with different id.
- By default spring will create **Singleton objects**. If we create two reference for same obj then spring will not create two obj it will just pass the same reference.
- To avoid singleton obj we should assign the scope to **Prototype**.
  ```
      <bean id="alien" class="com.nishanthan.Alien"></bean> // Singleton is the default
      <bean id="alien" class="com.nishanthan.Alien" scope="prototype"></bean>
  ```
- Also obj for all listed class will be created on startup itself.
- For example, we have created obj1 and obj2 for class Student and we assigned name as "Java" for obj1 but we didn't assisgned for obj2 but also obj2 will have name as "Java" since spring has passed the **Singleton Object**.

  ```
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      Student obj1 = (Student) context.getBean("student");
      obj.name = "Java";

      Student obj2 = (Student) context.getBean("student");

      System.out.println(obj1.name); // Java
      System.out.println(obj2.name); // Java

     /*
        Usually if we didn't assign the value to variable / property of the class we will get the defined datatypes's default value
        So, you may think we will get **null**;

        But spring will create singleton class so that if any property has changed for one obj it will reflect on all of it's reference.
     */

      context.close();
  ```

## Singleton vs Prototype

- **Singleton**

  - Object will be created at the time of running our application irrespective of if we are using that in our application.
  - Object will be created for all class listed in the xml file.
  - Only one obj will be created for the class for the entire application.
  - Change in any of the class's property on obj will reflect on all obj references, because for all reference spring will pass the same obj again and again.

- **Prototype**

  - Object will be created at the time we are asking for it on code level.
  - Object will created only for the classes used in the code, not for all listed in the xml file.
  - For every obj reference spring will create new object for the class not same obj for all the references.
  - Changes in the property of one obj reference will not affect for other reference since spring will create new obj for all references
