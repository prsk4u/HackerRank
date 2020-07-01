input()
a = [0] + [int(x) for x in input().split()] 
b = [0] + [int(x) for x in input().split()]
table = [[0 for _ in range(len(a))] for _ in range(len(b))]
for i in range(1,len(b)):
  for j in range(1,len(a)):
    if a[j] == b[i]:
      table[i][j] = table[i-1][j-1] + 1
    else:
      table[i][j] = max(table[i][j-1], table[i-1][j])
length = table[len(b)-1][len(a)-1]
common_subsequence = []
curr = len(b)-1,len(a)-1
while length:
  if b[curr[0]] == a[curr[1]]:
    common_subsequence.append(b[curr[0]])
    length -= 1
    curr = (curr[0]-1,curr[1]-1)
  else:
    if table[curr[0]-1][curr[1]] > table[curr[0]][curr[1]-1]:
      curr = (curr[0]-1,curr[1])
    else:
      curr = (curr[0],curr[1]-1)
print(' '.join(str(x) for x in common_subsequence[::-1]))
