# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * Divide the number by 10 to get the last digit with mod. When the last digit it 7,8, and 9 it is a "+". When last digit is 0,1, and 2 it is "-". When there is 100 it is already A+ so you out the if statement for 100 first then slowly use the other inner if statements to get the rest.


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * Out a >= sign if the number is more to equal to A+.


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * Outside of the inner if statements out a else statment to classify any failed grades as F.
