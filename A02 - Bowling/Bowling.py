
# ===================================================================================================
#   Write a program (with your choice of programming language) that calculates the score of a single 
#   bowling game for a single player.
#   Input: The sequence of throws.
#   Expected output: The score in each frame. Text outputs will be acceptable, 
#
#   GUI output will get extra points.
#   Display scores after each frame.
#   
#   
#   
#   Submit source codes along with the result screenshots of the following four test cases:
#    Test case 1: all zeros
#    Test case 2: all strikes (perfect game)
#    Test case 3: all spare
#    Test case 4: your own case
# ===================================================================================================





def get_throw(prompt, max_pins=10):                                                             # handles user input and ensures it's valid
    while True:
        try:
            pins = int(input(prompt))
            if 0 <= pins <= max_pins:                                                           # makes sure input is within valid range
                return pins
            else:
                print(f"Please enter a number between 0 and {max_pins}.")                       # keeps track of max pins left and makes sure input is valid
        except ValueError:
            print("Invalid input. Enter an integer.")


def calculate_score(frames):                                                                    # keeps track of score and calculates it based on bowling rules
    score = 0
    scores_by_frame = []
    for i in range(len(frames)):
        frame = frames[i]
        if i == 9:                                                                              # 10th frame has special rules       
            score += sum(frame)
        elif frame[0] == 10:                                                                    # Strike
            bonus = 0
            if i + 1 < len(frames):                                                             # checks if next frame is within bounds
                next_frame = frames[i + 1] 
                bonus += next_frame[0] 
                if len(next_frame) > 1:
                    bonus += next_frame[1]
                elif i + 2 < len(frames):
                    bonus += frames[i + 2][0]
            score += 10 + bonus
        elif sum(frame[:2]) == 10:  # Spare
            bonus = frames[i + 1][0] if i + 1 < len(frames) else 0
            score += 10 + bonus
        else:
            score += sum(frame[:2])
        scores_by_frame.append(score)
    return scores_by_frame




def main():
    print("\n\n\n--=====  Bowling Score Calculator  =====--")
    frames = []

    for i in range(1, 11):
        print(f"\nFrame {i}:")
        if i < 10:
            first = get_throw("  First throw: ")
            if first == 10: # Strike                                                            #  First throw gets all 10 pins = strike
                frames.append([10])
                print("  Strike!")
            else:
                second = get_throw("  Second throw: ", max_pins=10 - first)                     # Max total must be 10
                frames.append([first, second])
        else:
            # 10th frame logic
            first = get_throw("  First throw: ")
            second = get_throw("  Second throw: ", max_pins=10 if first == 10 else 10 - first)
            frame = [first, second]
            if first == 10 or first + second == 10:                                             # If the first two throws equal 10, allow a third throw
                third = get_throw("  Third throw: ")
                frame.append(third)
            frames.append(frame)

        scores = calculate_score(frames)
        print(f"✅ Score after Frame {i}: {scores[-1]}")

    print("\n🎉 Final Score:", scores[-1])

if __name__ == "__main__":
    main()

   