def mod(p, q):
	"Return the remainder of an integer division."
   	c = 0
   	while (p - q*c) > 0:
   		c += 1
   		print c
   	return p - q*(c - 1)
