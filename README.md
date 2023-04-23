# Weekly Test 4 (Managing Resturants)
This is a API project for insert, read, update, and delete Resturant.

![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot "Spring Boot") ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white "Java") ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white "Postman") ![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white "Google Chrome")

## Frameworks and Languages
![Java v17](https://img.shields.io/badge/Java-v17-green "Java 17") ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.0.6-brightgreen "Spring Boot v3.0.6")

---
## Browser / Tools
![Google Chrome](https://img.shields.io/badge/Google%20Chrome-v112.0.5615.138-yellow "Google Chrome") ![Postman](https://img.shields.io/badge/Postman-v10.13.0-orange "Postman")
---

## Model
- ### Resturant
    - ```java
      private String resturantName;
      ```
    - ```java
      private String resturantAddress;
      ```
    - ```java
      private long resturantContact;
      ```
    - ```java
      private String spaciality;
      ```
    - ```java
      private int totalStaffs;
      ```
    - ```java
      private Review review;
      ```
    - ```java
      private int numberOfReviews;
      ```
- ## Review (Enum)
    - `VERYBAD`
    - `BAD`
    - `OK`
    - `GOOD`
    - `VERYGOOD`
---
## Dataflow
- ### End Points / Controllers
    - For getting a Resturant by id -
        ```java
        @GetMapping("Resturant/{resturantId}")
            public Object getResturantById(@PathVariable int resturantId) {
                return resturantService.getResturantById(resturantId);
        }
        ```
    - For getting all the Resturants -
        ```java
        @GetMapping("Resturants")
        public List<Resturant> getAllResturants() {
            return resturantService.getAllResturants();
        }
        ```
    - For adding a Resturant -
        ```java
        @PostMapping("Resturant")
        public String addResturant(@RequestBody Resturant resturant) {
            return resturantService.addResturant(resturant);
        }
        ```
    - For updating a Resturant by id -
        ```java
        @PutMapping("Resturant/All/{resturantId}")
        public String updateResturantById(@PathVariable int resturantId, @RequestBody Resturant updatedResturant) {
            return resturantService.updateResturantById(resturantId, updatedResturant);
        }
        ```
    - For deleting a Resturant by id -
        ```java
        @DeleteMapping("Resturant/{resturantId}")
        public String deleteResturantById(@PathVariable int resturantId) {
            return resturantService.deleteResturantById(resturantId);
        }
        ```
- ### Services
    - ```java
        public Object getResturantById(int resturantId) {
            try {
                return resturantDao.getAll().get(resturantId);
            } catch (IndexOutOfBoundsException e) {
                return "Invalid Resturant ID : " + resturantId;
            } catch (Exception e) {
                return "Adding Resturant failed....!!!";
            }
        }
        ```
    - ```java
        public List<Resturant> getAllResturants() {
            return resturantDao.getAll();
        }
        ```
    - ```java
        public String addResturant(Resturant resturant) {
        if (resturantDao.add(resturant))
            return "Resturant added successfully....!!!";
        else
            return "Adding Resturant failed....!!!";
        }
        ```
    - ```java
        public String updateResturantById(int resturantId, Resturant updatedResturant) {
            try {
                resturantDao.update(resturantId, updatedResturant);
                return "Updated Resturant successfully....!!!";
            } catch (IndexOutOfBoundsException e) {
                return "Invalid Resturant ID : " + resturantId;
            } catch (Exception e) {
                return "Updating Resturant failed....!!!";
            }
        }
        ```
    - ```java
        public String deleteResturantById(int resturantId) {
            try {
            resturantDao.remove(resturantId);
                return "Resturant deleted successfully....!!!";
            } catch (IndexOutOfBoundsException ex) {
                return "Invalid Resturant ID : " + resturantId;
            } catch (Exception e) {
                return "Deleting Resturant failed....!!!";
            }
        }
        ```
- ### Repository
    - Getting all the Resturants from data source
        ```java
        public List<Resturant> getAll() {
            return resturantList;
        }
        ```
    - Saving the Resturant into the data source
        ```java
        public boolean add(Resturant resturant) {
            resturantList.add(resturant);
            return true;
        }
        ```
    - Updating Resturant in the data source
        ```java
        public Resturant update(int resturantId, Resturant updatedResturant) {
            return resturantList.set(resturantId, updatedResturant);
        }
        ```
    - Removing Resturant from the data source
        ```java
        public Resturant remove(int resturantId) {
            return resturantList.remove(resturantId);
        }
        ```
- ### Database
    I haven't used any **Database** in this project yet. But for data storing I have used a `Collection`.

    ```java
    private final List<Resturant> resturantList;
    ```
---
## Datastructures
- `ArrayList<>`
---
## Summary
This API is a `Spring Boot` project that is about managing Resturants. We can create, read, update, and delete Resturant. In this project request is sent from the client on HTTP in JSON body or from path variable and stored in object then response is sent back from the server by JSON format to the client.

