class Student // by default, every class extends the Object class
{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override // this will override the default print for Student objects
    public String toString() {
        return "Student [rollno= " + rollno + ", name = " + name + "]";
    }
}

public class DemoStringsArrays {
    public static void main(String args[]) {

        // these are both equivalent. String is not a primitive data type, but java
        // understands if you assign it directly without calling the constructor
        String s = "Navin";
        String s2 = new String("Navin");

        // strings are immutable
        s = s + " Bhat";
        System.out.println(s); // This will print Navin Bhat, but it is a new string. It did not modify the
                               // original
        // This means that Navin still exists in memory, even though s is not pointing
        // to it

        // instead we can use something called StringBuffer
        StringBuffer s1 = new StringBuffer("Navin");
        s1.append(" Bhat");

        System.out.println(s1);

        // Arrays
        int nums[] = new int[2]; // this is an array of integers of size 2
        // we can then directly assign indices
        nums[0] = 8;
        nums[1] = 5;

        // to directly assign the values we can do the following
        int nums2[] = { 6, 8, 3, 2 };

        for (int i = 0; i < nums2.length; i++) { // note that i <= nums.length will not work because it will try to
                                                 // index nums2[4] which doesnt exist
            System.out.println(nums2[i]);
        }

        // we can also create an enhanced for loop (similar to for item in items that we
        // would say in python)
        for (int i : nums2) {
            System.out.println(i);
        }

        Student student1 = new Student(1, "Rishabh");
        System.out.println(student1); // this should print the overriden .toString method we defined in the student
                                      // class

        // we can also create arrays of objects
        Student students[] = new Student[4]; // creates an Array of size 4
        students[0] = student1;
        students[1] = new Student(2, "Navin");
        students[2] = new Student(3, "Gowri");
        students[3] = new Student(4, "Rithik");

        for (Student stud : students) {
            System.out.println(stud);
        }

    }
}
