
key1 = "no"
rope = "no"
goblinend = "no"
goblindeath = "no"
silvkey = "no"
combo = []
correctcombo = [35,25,43,12,9]
condition1 = False
continue2 = False
continue3 = False
continue4 = False
CONTINUE = False
goblinevent = True
counter = 3

import random
hardchance = random.randint(1,10)
chance1 = random.randint(1,3)
chance2 = random.randint(1,2)
chance3 = random.randint(1,3)
chance4 = random.randint(1,4)



def WordCheck(x):                                                                   #This is my 3nd function, that checks to make sure your bet is a number. Unlike the other 2 functions, it uses a parameter.
    try:
        check = (int(100*float(x)-0.5)+1) / 100                                   #This part of the function tries to round the bet that you provided (as it will need to do this later). I use the try block in order to do so. It also uses the x parameter, which will be replaced by the value added in the code when used.
    except ValueError:
        return False                                                                #If the program created an error, this means that the bet entered was a word, and the function is returned as false
    else:
        return True

def listchecker():
    global continue3
    if combo == correctcombo:
        print("The lock sprun open!")
        combo.clear()
        continue3 = True
        return True
    else:
        print("The lock doesn't budge, and sensing an end it resets itself.")
        combo.clear()
        return False

def whichway(x):
    if x == "e":
        return 1
    elif x == "w":
        return 2
    elif x == "n":
        return 3
    elif x == "s":
        return 4
    elif x == "wait" or x == "no":
        return 5
    elif x == "try":
        return 6
    else:
        return False

def keyluck():
    global chance2
    global silvkey
    global continue2
    while True:
        try1 = input("Would you like to try to reach the silver key? (y/n): ")
        if try1 != "y" and try1 != "n":
            print("Please enter y or n.")
            continue
        else:
            break
    if try1 == "y":
        if chance2 == 1:
            print("You are able to reach the silver key, and you take it. However, the gold key continues to tempt you.")
            silvkey = "yes"
            while True:
                try2 = input("Would you like to try to reach the gold key? (y/n): ").lower()
                if try2 != "y" and try2 != "n":
                    print("Please enter y or n.")
                    continue
                else:
                    break
            if try2 == "y":
                print("Just as you grab the golden key, the spoke holding the key falls, and you are dragged along with it. It seems that in the end, you were betrayed by your own greed.")
                print("YOU GOT THE GREEDY ENDING")
                print("-All that glitters is not gold - Shakespeare's The Merchant of Venice")
                while True:
                    death = 1
            if try2 == "n":
                print("You break away from your temptation, and you decide to leave the key.")
                continue2 = True

        else:
            print("As you try to reach the key, you slip and fall into the abyss. Your body is never seen again, and no-one notices your disapearence.")
            print("YOU GOT THE FALLING ENDING")
            print("-This is probably the third ending where you fall and die.")
            while True:
                death = 1
    if try1 == "n":
        print("You conquer your temptation, and you decide not to risk the keys.")
        continue2 = True
    while True:
            willyou = input("Would you like to try to say the password? (y/n): ").lower()
            if willyou == "y":
                passwrd = input("What do you think the password is? ").lower()
                print("You say \"" + str(passwrd) + "\" out loud.")
                if passwrd == "impossible":
                    print("Correct! The door opens and you step inside. Inside, you see a silver lock with an inscription -4th: 12-")
                    print("You also find a horse. Seeing a horse in this dungeon comforts you.")
                    if silvkey == True:
                        print("You unlock the silver lock, using the key you found in the pit. A previously unseen hatch opens up in the wall, revealing a pile of gold, and one of the dungeon walls falls over, revealing an open forest. You don't know what you'll do know, but with a horse and some gold, you feel content.")
                        print("YOU GOT THE RICH ENDING")
                        print("-This is the only thing the silver key is used for.")
                        while True:
                            death = 1
                    else:
                        print("The horse fills you with happiness, and you feel better than you've ever felt before. Being around someone else is so comforting, you decide to never leave the room, and you decide to make a life for yourself in this cold dungeon, with the horse.")
                        print("YOU GOT THE HORSE ENDING")
                        print("-Is this a happy or a sad ending? You found a companion, but you never leave the dungeon. I suppose you can be the one to decide if this is a good or bad ending.")
                        while True:
                                death = 1

                else:
                    print("The door doesn't move, indicating that the password was not correct. You hear a click, indicating that you've used one of your tries.")
                    counter = counter - 1
                    if counter == 0:
                        print("Suddenly, a latch opens up in the wall, and a poisonous dart is shot at you. The poison is lethal, and you can feel yourself getting sleepy. You try to keep awake, but the poison wins out, and you are pulled into a sleep from which you will never wake up.")
                        print("YOU GOT THE POISON ENDING")
                        print("-You know, the note above the door clues you in on the password.")
                        while True:
                            death = 1
                    while True:
                        moveon = input("Do you want to go try the password again, or would you like to go back north to the hall? (y for password, n for north): ").lower()
                        if moveon == "n":
                            print("You decide to head back up to the hall.")
                            breakit = True
                            break
                        elif moveon == "y":
                            break
                        else:
                            print("Enter either y or n.")
                            continue



print("You wake up in cell, confused with your surroundings. You look around and discover that you seem to be in an abandoned dungeon. You can go north to leave the cell.")
while True:
    direction = input("Which way would you like to go? (n for north, e for east, s for south and w for west): ").lower()
    if whichway(direction) == 3:
        print("You go north.")
        break
    elif whichway(direction) == 5:
        print("You decide to wait in the cell. You wait and wait for hours, days, weeks. You lose track of time, and you feel your grip on reality slipping away. Slowly, you die of starvation and dehydration.")
        print("YOU GOT THE IMPRISONED ENDING")
        print("-You looked through the code to find this ending, didn't you? Or maybe you just got lucky while trying to break the game. Think of this as a secret ending.")
        while True:
            death = 1
    else:
        print("After pondering a direction, you get confused and run into a wall. Unfortunately, your head hits a metal railing and you fall. You see something written on the ceiling; - 5 numbers in total, 5th - 9.")
        print("Clearly, the designer of this cell had been very intellegent to leave you a hint for later in this circumstance. After all, they had felt that a prisoner like you would not decide to go north, and instead try to do something else entirely.")

print("As you exit the cell and enter the corridor, the door locks itself.")

while True:
    if CONTINUE == True:
        break
    print("In the broken corridor, you see two paths; one to the West and one to the East.")
    direction = input("Which way would you like to go? (n for north, e for east, s for south and w for west): ").lower()
    if whichway(direction) == 2:
        print("You go west.")
        while True:
            if rope == "no":
                print("You find a door, and next to it you find an old rope. The door has a rusty lock on it, and it looks like you'll need a key to open it. The rope is worn, though it will still work well, and it may help you.")
                take = input("Take the rope? y/n: ").lower()
                if take == "y":
                    print("You take the rope.")
                    rope = "yes"
                    break
                if take == "n":
                    print("For some reason, you decide to leave the rope.")
                    break
                else:
                    print("You can't do that with the rope.")
                    continue
            if rope == "yes":
                print("You find the door again. It has not changed, but you will still need a key to open the door.")
                break
        if key1 == "yes":
            print("You use the key to unlock the door. The key fits perfectly, but upon unlocking the door the key breaks. You can now go west, through the door.")
            condition1 = True

        while True:
            direction = input("Which way would you like to go? (n for north, e for east, s for south and w for west): ").lower()
            if whichway(direction) == 1:
                print("You go east.")
                goback1 = True
                break
            if whichway(direction) == 2 and condition1 == True:
                print("You go through the unlocked door")
                continue1 = True
                CONTINUE = True
                break
            else:
                print("After pondering a direction, you get confused and run into a wall. You decide to rethink the direction you will go in.")
                continue
        if goback1 == True:
            goback1 = False
            continue
        if continue1 == True:
            continue1 = False
            break


    elif whichway(direction) == 1:
        print("You go east.")
        while True:
            print("You find that the room is split in two by a large hole in the ground. It would be hard to jump across, but if you had something like a rope to help you you might have a better chance of making it.")
            if rope == "yes":
                pit = input("Will you try to cross the pit? y/n: ").lower()
                if pit == "y":
                    if chance1 != 1:
                        print("With help from the rope, you cross the pit.")
                        print("You find a key on the other side, which may help you to unlock a door. You also find a worn note taped to it, that says: -1st: 35, 3rd: 43-. You take the key, and wonder about the meaning of the note.")
                        key1 = "yes"
                        print("You notice two keys stuck to a spoke in the hole, one silver and one gold. The silver one seems closer than the gold one, but the brilliant luster of the metal makes you feel a sudden need for both keys.")
                        keyluck()
                        break
                    else:
                        print("While swinging with the rope, the rope snaps, and you fall into the pit. You start to believe that the pit may be endless, but you are proven wrong when you are impaled by spikes at the bottom.")
                        print("YOU GOT THE UNLUCKY IMPALED ENDING")
                        print("-In truth, the rope gave you a better chance of survival, you're just unlucky.")
                        while True:
                            death = 1
                elif pit == "n":
                    print("You decide against swinging. However, it might currently be your only option.")
                    continue2 = True
                    break
            else:
                while True:
                    pit = input("Will you try to jump across the pit? It is risky... (y/n): ").lower()
                    if pit != "y" and pit != "n":
                        print("I don't understand. Please print y or n")
                        continue
                    else:
                        break
                if pit == "y":
                    if hardchance == 1:
                        print("Miraculously, you are able to jump across the pit.")
                        print("You find a key on the other side, which may help you to unlock a door. You also find a worn note taped to it, that says: -1st: 35, 3rd: 43-. You take the key, and wonder about the meaning of the note.")
                        key1 = "yes"
                        print("You notice two keys stuck to a spoke in the hole, one silver and one gold. The silver one seems closer than the gold one, but the brilliant luster of the metal makes you feel a sudden need for both keys.")
                        keyluck()
                        break
                    else:
                        print("You try to jump the pit, but you barely miss the end and fall into the pit. As you fall, you contemplate if there was a better way to cross the pit. Your thinking is cut short when you reach the bottom and fall onto a large spike, killing you.")
                        print("YOU GOT THE MISJUDGED IMPALED ENDING")
                        print("-If only there was a better way to cross the pit...")
                        while True:
                            death = 1
                elif pit == "n":
                    print("You decide against jumping across the pit, which is likely for the better.")
                    continue2 = True
                    break
        if continue2 == True:
            continue2 = False
            while True:
                direction = input("Which way would you like to go? The only path is now to leave the room by going west. (n for north, e for east, s for south and w for west): ").lower()
                if whichway(direction) == 2:
                    print("You go west.")
                    goback2 = True
                    break
                else:
                    print("After pondering a direction, you get confused and run into a wall. You decide to rethink the direction you will go in.")
                    continue
    elif whichway(direction) == 4:
        print("The door to the cell is locked, and you can't go back.")
        continue
    else:
        print("After pondering a direction, you get confused and run into a wall. You decide to rethink the direction you will go in")
        continue
# is less than 2, return instead the empty string.
def both_ends(s):
    if len(s) < 2:
      return ""
    else:
        return s[0:2] + s[len(s)-2:]


# C. fix_start
# Given a string s, return a string
# where all occurences of its first char have
# been changed to '*', except do not change
# the first char itself.
# e.g. 'babble' yields 'ba**le'
# Assume that the string is length 1 or more.
# Hint: s.replace(stra, strb) returns a version of string s
# where all instances of stra have been replaced by strb.
def fix_start(s):
  # +++your code here+++
  return


# D. MixUp
# Given strings a and b, return a single string with a and b separated
# by a space '<a> <b>', except swap the first 2 chars of each string.
# e.g.
#   'mix', pod' -> 'pox mid'
#   'dog', 'dinner' -> 'dig donner'
# Assume a and b are length 2 or more.
def mix_up(a, b):
  # +++your code here+++
  return


# Provided simple test() function used in main() to print
# what each function returns vs. what it's supposed to return.
def test(got, expected):
  if got == expected:
    prefix = ' OK '
  else:
    prefix = '  X '
  print('%s got: %s expected: %s' % (prefix, repr(got), repr(expected)))


# Provided main() calls the above functions with interesting inputs,
# using test() to check if each result is correct or not.
def main():
  print('donuts')
  # Each line calls donuts, compares its result to the expected for that call.
  test(donuts(4), 'Number of donuts: 4')
  test(donuts(9), 'Number of donuts: 9')
  test(donuts(10), 'Number of donuts: many')
  test(donuts(99), 'Number of donuts: many')

  print()
  print('both_ends')
  test(both_ends('spring'), 'spng')
  test(both_ends('Hello'), 'Helo')
  test(both_ends('a'), '')
  test(both_ends('xyz'), 'xyyz')


  print()
  print('fix_start')
  test(fix_start('babble'), 'ba**le')
  test(fix_start('aardvark'), 'a*rdv*rk')
  test(fix_start('google'), 'goo*le')
  test(fix_start('donut'), 'donut')

  print()
  print('mix_up')
  test(mix_up('mix', 'pod'), 'pox mid')
  test(mix_up('dog', 'dinner'), 'dig donner')
  test(mix_up('gnash', 'sport'), 'spash gnort')
  test(mix_up('pezzy', 'firm'), 'fizzy perm')


# Standard boilerplate to call the main() function.
if __name__ == '__main__':
  main()

