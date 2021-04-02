import turtle

STARTING_SIZE = 8
STEP = 4
NUM_SIDES = 61
ANGLE = 90
ANIMATION_SPEED = 0

turtle.speed(ANIMATION_SPEED)
turtle.hideturtle()

size = STARTING_SIZE

for i in range(NUM_SIDES):
    turtle.left(ANGLE)
    turtle.forward(size)

    size = size + STEP

turtle.done()
