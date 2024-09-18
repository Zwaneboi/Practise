def Add(x,y):
  c = x + y
  return c

def Sub(x ,y ):
  c = x - y 
  return c 

def Div(x,y):
  c = x / y
  return c 

def Mul(x,y):
  c = x * y
  return c


def Res(i,x,y,r):
  r = i(x,y)
  return r

k = ''
print(Res(Add,4,5,k))

t= ''

while True :
  resp = input('Please pick A for addition, S for subtraction, D for division, M for muiltiplication or Q to quit.\t')
  if resp.upper() == 'Q':
    print('Thank you for using my program bye')
    break
  x = int(input('Please pick the first number\t'))
  y = int(input('Please pick the second number\t'))
  if resp.upper() == 'A':
    print('The result of of adding {0} and {1} is {2}'.format(x,y,Res(Add,x,y,t)))
  elif resp.upper() == 'S':
    print('The result subtracting {0} from {1} is {2}'.format(y,x,Res(Sub,x,y,t)))
  elif resp.upper() == 'D':
    print('The result of dividing {0} by {1} is {2}'.format(x,y,Res(Div,x,y,t)))
  elif resp.upper() == 'M':
    print('The result of multiplying {0} by {1} is {2}'.format(x,y,Res(Mul,x,y,t)))
