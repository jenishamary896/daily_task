class person {
    String name;
    int age;
    public void introduce(String name,int age)  {
         System.out.println("welcome "+name);
}

    
    public static void main(String[] args) {
        person person1=new person();
        person1.introduce("jeni",18);
    }
}
