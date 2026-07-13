package StudentsRecordSystem;
import java.util.*;



public class Main {
    // Shared list to store student objects
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        boolean running = true;

        System.out.println("====== Welcome to the Student Records System ======");

        // Simple Menu Loop
        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Sort Students by Grade");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    sortStudents();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting application");
                    break;
                default:
                    System.out.println("Invalid choice Please enter a number between 1 and 7.");
            }
        }
    }

    
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        
        
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.println("Error: A student with this ID already exists.");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Grade: ");
        double grade = scanner.nextDouble();

        studentList.add(new Student(id, name, grade));
        System.out.println("Student added successfully!");
    }

   
    private static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            System.out.println(s); 
        }
    }

    
    private static void updateStudent() {
        System.out.print("Enter the ID of the student to update: ");
        String id = scanner.nextLine();
        
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.print("Enter New Name (Current: " + s.getName() + "): ");
                s.setName(scanner.nextLine());
                System.out.print("Enter New Grade (Current: " + s.getGrade() + "): ");
                s.setGrade(scanner.nextDouble());
                System.out.println("Student record updated successfully");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    
    private static void deleteStudent() {
        System.out.print("Enter the ID of the student to delete: ");
        String id = scanner.nextLine();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equalsIgnoreCase(id)) {
                studentList.remove(i);
                System.out.println("Student record deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // 5. SEARCH STUDENT (By ID or Name)
    private static void searchStudent() {
        System.out.print("Search by (1) ID or (2) Name \n Choose option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        boolean found = false;

        if (option == 1) {
            System.out.print("Enter ID to search: ");
            String id = scanner.nextLine();
            for (Student s : studentList) {
                if (s.getId().equalsIgnoreCase(id)) {
                    System.out.println("Match found -> " + s);
                    found = true;
                }
            }
        } else if (option == 2) {
            System.out.print("Enter Name to search: ");
            String name = scanner.nextLine();
            for (Student s : studentList) {
                
                if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println("Match found -> " + s);
                    found = true;
                }
            }
        } else {
            System.out.println("Invalid option.");
            return;
        }

        if (!found) {
            System.out.println("No matching records found.");
        }
    }

    // 6. SORT STUDENTS BY GRADE (Using Comparator)
    private static void sortStudents() {
        if (studentList.isEmpty()) {
            System.out.println("List is empty. Nothing to sort.");
            return;
        }

       // studentList.sort ((s1,s2 ) ->   Double.compare(s2.getGrade(), s1.getGrade()) );
          
        
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGrade(), s1.getGrade());
            }
        });

        System.out.println("Students sorted by grade (Highest to Lowest) successfully! Choose option 2 to view.");
    }
}