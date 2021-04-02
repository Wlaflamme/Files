# This program draws a design using repeated squares.
import turtle

# Named constants
STARTING_X = 4
STARTING_Y = 4
STARTING_SIZE = 8
NUM_SQUARES = 50
STEP = 4
NUM_SIDES = 4
ANGLE = 90
ANIMATION_SPEED = 0

turtle.speed(ANIMATION_SPEED)
turtle.hideturtle()

x = STARTING_X
y = STARTING_Y
size = STARTING_SIZE

for count in range(NUM_SQUARES):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()

    for s in range(NUM_SIDES):
        turtle.backward(size)
        turtle.right(ANGLE)

    size = size+STEP

turtle.done()


