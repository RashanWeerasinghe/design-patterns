//Incorrect:one class with multiple responsibilities

class Report{
    void generateReport(){
        //logic for generating a report
    }

    void saveToFile(){
        //logic for saving the report to a file
    }
}

//correct:separate classes for each reponsibility

class Report{
    void generateReport(){
        //logic for generating a report
    }
}
class ReportSaver {
    void saveToFile(Report report) {
        // logic for saving the report to a file
    }
}