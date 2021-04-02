def perfect(n):
    sum = 0
    for x in range(1, n):
        if n % x == 0:
            sum += x
    return sum == n


def displayfactors(n):
    if sum == n:
        print(n, '= ', end=' ')
        for y in range(1, n):
            if n % y == 0:
                print(y, end=' ')


def main():
    count = 0
    for n in range(1, 1000):
        if perfect(count) is True:
            print(displayfactors(count))
        count += 1


if __name__ == '__main__':
    main()
