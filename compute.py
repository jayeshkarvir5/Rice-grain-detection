	
     
 # main
B1=[0]*5000000
A1=[0]*5000000
A=[0]*5000000
#Ale=raw_input().split()
Ale=[]
try:
	Ale=raw_input().split()
except(EOFerror):
	w=0   # random assignment, not needed
   
n=int(Ale[0])
q=int(Ale[1])
xora=0

A_le=[]
#A_le=raw_input().split()
try:
	A_le=list(map(int,raw_input().split()))
except(EOFerror):
	w=0  # random assignment, not needed

i=1
while (i<=(n//2)):
	A[i]=(int(A_le[i-1]))
	xora=xora^A[i]
	A1[xora]=A1[xora]+1
	B1[i]^=xora
	i=i+1
	#	A[i+1]=int(A_le[i])

A11=xora

i=(n//2)+1
while (i<=n):
	A[i]=(int(A_le[i-1]))
	i=i+1
	#A.append(int(A_le[i]))


i=1
while (i<=q):
	type,a,b=map(int,raw_input().split())
	if type==1:
		if a<=n//2: 
			purana=A[a]
			j=a;
			while (j<=(n//2)):
				A1[B1[j]]=A1[B1[j]]-1
				B1[j]=B1[j]^purana^b
				A1[B1[j]]=A1[B1[j]]+1
				j=j+1
				
			A11=A11^purana^b
			A[a]=b
		else:   
			A[a]=b  
	else:
		if a<=n//2:  
			st=1
			c=0
			xora=0  
		else:
			st=n//2+1
			c=A1[b]
			xora=A11
			
		j=st;
		while (j<=a):
			xora=xora^A[j]
			if xora==b:
				c=c+1	
			j=j+1
			
		print c
    	
	i=i+1
