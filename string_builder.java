
class string_builder {
    
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello World!");

        // Convert StringBuilder to String
        String result = sb.toString();

        // Print the result
        System.out.println(result);  // Output: Hello World!

        //get character at index
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch);  // Output: H

        // set character at index
        sb.setCharAt(0, 'h');
        System.out.println("After setting character at index 0: " + sb.toString());  // Output: hello World!

        // insert a character at a specific index
        sb.insert(5, ',');  
        System.out.println("After inserting character at index 5: " + sb.toString());  // Output: hello, World!

        // delete a character at a specific index
        sb.deleteCharAt(5);
        System.out.println("After deleting character at index 5: " + sb.toString());

        // append a string
        sb.append(" How are you?");
        System.out.println("After appending a string: " + sb.toString());  // Output: hello World! How are you?

        // print the length of the StringBuilder
        System.out.println("Length of StringBuilder: " + sb.length());  // Output:  hello World! How are you? 

        // reverse the StringBuilder
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("After reversing: " + sb.toString());  // Output: ?uoy era woH !dlroW olleh


    }
}
