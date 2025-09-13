package methodOverriding;

class Employee {
    protected void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    @Override
    public void work() { //  allowed: increased visibility
        System.out.println("Manager is managing");
    }

    /*
    @Override
    private void work() {  //  compile-time error: cannot reduce visibility
        System.out.println("Private work");
    }
    */
}

