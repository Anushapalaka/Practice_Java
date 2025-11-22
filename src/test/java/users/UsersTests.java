package users;

import org.testng.annotations.Test;

public class UsersTests extends UsersSteps{


        @Test (priority = 1)
        public void testGetUsers() {
            getUsers();
        }

        @Test
        public void testGetSpecificUser() {
            getSpecificUser();
        }

        @Test
        public void testGetUserWithName() {
            getUserWithName("Todd Johnson");
        }

        @Test
        public void testGetUserWithAge() {
            getUserWithAge(29);
        }

        @Test
        public void testGetWithGender() {
            getWithGender("male");
        }

        @Test
        public void testGetWithCompany() {
            getWithCompany("Rice, Lowe and Connelly");
        }

        @Test
        public void testGetWithJob() {
            getWithJob("Internal Usability Liaison");
        }

        @Test
        public void testSortAsc() {
            sortAsc();
        }

        @Test
        public void testPagination() {
            pagination(1);
        }

        @Test
        public void testCombinedFilter() {
            combinedFilter("name", "asc", 1, 10);
        }

        @Test
        public void testCreateNewUser() {
            createNewUser();
        }

        @Test
        public void testModifyData() {
            modifyData();
        }

}
