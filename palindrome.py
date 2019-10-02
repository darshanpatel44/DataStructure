# def max(x,y):
    # if(x>y):
        # return x
    # return y
# 
# def longest_pali(st,i,j):
    # if(i==j): 
        # return 1
    # 
    # if((st[i] == st[j]) and i + 1 == j ):
        # return 2
# 
    # if(st[i] == st[j]):
        # return longest_pali(st,i+1,j-1)+2
# 
    # a=longest_pali(st,i,j-1)
    # b=longest_pali(st,i+1,j)
# 
    # return max( a , b )
# 
# if __name__ == "__main__":
    # st = "madam 121 32323 somemos"
    # n = len(st)
    # print(longest_pali(st,i,j))
    # print("length of longest palindrome is",longest_pali(st,0,n-1))




def max(x, y): 
    if(x > y): 
        return x 
    return y 
      

def lps(seq, i, j): 
      
    # Base Case 1: If there is  
    # only 1 character  
    if (i == j): 
        return 1
  
    # Base Case 2: If there are only 2  
    # characters and both are same  
    if (seq[i] == seq[j] and i + 1 == j): 
        return 2
      
    # If the first and last characters match  
    if (seq[i] == seq[j]): 
        return lps(seq, i + 1, j - 1) + 2
  
    # If the first and last characters 
    # do not match  
    return max(lps(seq, i, j - 1),  
               lps(seq, i + 1, j)) 
  
if __name__ == '__main__': 
    seq = "somdmos akaka 112131211 ccc"
    n = len(seq) 
    print("The length of the LPS is",  
                  lps(seq, 0, n - 1)) 