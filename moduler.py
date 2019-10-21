n = input()



def modul(n):
    for i in range(n):
       numbers = map(int, input().split())

    return (n * (n + 1) * (n + 2)) / 6

print(modul(n))

