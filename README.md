# 2023.05.27-Ship Prices
Kylo Ren is monitoring ship prices across the galaxy. He wants to determine the current health of the intergalactic ship market (war is always good for sales!). One measure is the median price, or the middle price of all the ship sales when put in order from smallest to greatest. If there are an even number of ships, then there are technically two medians! Help Kylo Ren write a program to determine the names of the ships with the median prices.

https://drive.google.com/open?id=173qRpWZiYZJUj_MC_fy4nJtOuoPl3RSr

##### Input Format
First line will contain an integer n indicating the number of lines to follow On the next n lines will be two pieces of information - the price of a ship followed by the name of the ship

##### Constraints
1 <= n <= 1000 All prices are integers greater than 0 Each price is unique

##### Output Format
The name (or names) of the ships with the median price If there are two medians, the order should be from least to greatest

##### Sample Input 0
8
414533 Millennium Falcon
4643460 Corellian Corvette
169624 Slave I
112932 Tie Advanced X1
544 X-34 Landspeeder
5483 Khetanna
217323 T-65 X-Wing StarFighter
9545 Podracer

##### Sample Output 0
Tie Advanced X1 and Slave I

##### Sample Input 1
3
414533 Millennium Falcon
4643460 Corellian Corvette
169624 Slave I

##### Sample Output 1
Millennium Falcon
