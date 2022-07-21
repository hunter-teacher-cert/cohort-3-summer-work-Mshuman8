############ MILD ############

## 1. Define a function called good_game that takes in a number of coins that Mario earned.

#If Mario didn't collect any coins, return "Better luck next time".
#If Mario earned ANY coins, return "Nice job earning those coins Mario".

# CALL YOUR FUNCTION AT LEAST THREE TIMES!

def good_game(num_coins):
  if (num_coins == 0):
    return "Better luck next time"
  elif num_coins > 0:
    return "Nice job earning those coins Mario!"
  else:
    return "That is not possible."

good1 = good_game(0)
print(good1)

good2 = good_game(5)
print(good2)

## 2. Write a function called better_game that takes in a number of coins that Mario earned.

#If Mario earned fewer than 20 coins, return "You got a few coins, get more next time!"
#If Mario earned exactly 20 coins, return "20 is a good amount."
#If Mario earned more than 20 coins, return "Congrats on earning a lot of coins!"

#CALL YOUR FUNCTION AT LEAST THREE TIMES!

def better_game(num_coins):
  if num_coins < 20:
    return "You got a few coins, get more next time!"
  elif num_coins == 20:
    return "20 is a good amount."
  elif num_coins > 20:
    return "Congrats on earning a lot of coins!"
    
better1 = better_game(20)
print(better1)

better2 = better_game(15)
print(better2)

better3 = better_game(30)
print(better3)

############ MEDIUM ############

##3. Eventually we want to make the goal adjustable. Write a function called coin_goal_tracker that takes in two parameters (a goal number of coins and the amount of coins Mario collected)

#If the goal number of coins is larger than the current amount of coins, return "Sorry you didn't make your goal :("
#If the goal number of coins is equal to the current amount of coins, return "You hit your goal! NICE!"
#If the goal number of coins is smaller than the current amount of coins, return "Congrats, you beat your goal!"

#CALL YOUR FUNCTION AT LEAST THREE TIMES!

def coin_goal_tracker(goal_coin, num_coll):
  if num_coll < goal_coin:
    return "Sorry you didn't make your goal"

  elif num_coll == goal_coin:
    return "You hit your goal! NICE!"

  else: 
    return "Congrats, you beat your goal!"

coin_goal1 = coin_goal_tracker(10,20)
print(coin_goal1)

coin_goal2 = coin_goal_tracker(20,20)
print(coin_goal2)

coin_goal3 = coin_goal_tracker(30,10)
print(coin_goal3)


############ SPICY ############

## 4. Advanced levels of Mario also have powerups which make Mario stronger! 

#Define a function called coin_power_ups that takes in two parameters (a number of coins and a number of power ups).

#If Mario got NO coins and NO powerups, return "You should try to get something next time!"
#If Mario got some coins but NO power ups, return "Great job with the coins, next time try to get some power ups!" 
#If Mario got more coins than they did power ups, return "So many, I wonder if you can buy power ups..."
#If Mario got the same amount of power ups and coins, return "Nicely done, same amount for power ups and coins!"
#If Mario got more power ups than coins, return "But coins help you win! Get more!"

#CALL YOUR FUNCTION AT LEAST FIVE TIMES!

def coin_power_ups(num_coins, power_ups):
  if num_coins == 0 and power_ups == 0:
    return "You should try to get something next time!"
  elif num_coins > 0 and power_ups == 0:
    return "Great job with the coins, next time try to get some power ups!"
  elif num_coins > power_ups:
    return "So many, I wonder if you can buy power ups..."
  elif num_coins == power_ups: 
    return "Nicely done, same amount for power ups and coins!"
  else:
    return "But coins help you win! Get more!"


coin_power1 = coin_power_ups(0,0)
print(coin_power1)

coin_power2 = coin_power_ups(20,0)
print(coin_power2)

coin_power1 = coin_power_ups(30,10)
print(coin_power3)

coin_power1 = coin_power_ups(20,20)
print(coin_power4)

coin_power1 = coin_power_ups(10,20)
print(coin_power5)