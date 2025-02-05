# Base class Student
class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age

    def display(self):
        print(f"Name: {self.name}")
        print(f"Grade: {self.grade}")
        print(f"Age: {self.age}")

# Derived class School inherits from Student
class School(Student):
    def __init__(self, name, grade, age):
        super().__init__(name, grade, age)
    
    def SchoolStudentDisplay(self):
        print("School Student Details:")
        self.display()

# Main function
def main():
    student1 = Student("Alice", "A", 15)
    student1.display()

    school_student = School("Bob", "B", 16)
    school_student.SchoolStudentDisplay()

# Ensures the main function runs when the script is executed
if __name__ == "__main__":
    main()
