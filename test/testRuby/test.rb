#!/bin/ruby

require 'json'
require 'stringio'



#
# Complete the 'fizzBuzz' function below.
#
# The function accepts INTEGER n as parameter.
#

def fizzBuzz(n)
    # Write your code here
n.times do |i|
    i+= 1
    if i%5 == 0 and i%3 != 0
        puts "Buzz"
    elsif i%3 == 0 and i%5 != 0
        puts "Fizz"
    elsif i%5 == 0 and i%3 == 0
        puts "FizzBuzz"
    else
        puts i
    end 
end

n = gets.strip.to_i