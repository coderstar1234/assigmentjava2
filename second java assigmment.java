# Get the number to create a multiplication table for from the user
number = int(input("Enter a number to create a multiplication table for: "))

# Create a loop to generate the multiplication table
for i in range(1, 11):
    # Multiply the current number by the loop variable and print the result
    result = number * i
    print(f"{number} x {i} = {result}")
