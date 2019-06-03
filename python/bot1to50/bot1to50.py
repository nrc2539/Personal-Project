from selenium import webdriver
from selenium.webdriver.common.keys import Keys

# Using Chrome to access web
driver = webdriver.Chrome()

# Open the website
driver.get('http://zzzscore.com/1to50')

xPath = "//div[@style='opacity: 1;']"
box = driver.find_elements_by_xpath(xPath) #return in list of element 'div' (total 25 elements)
click = 1
done = False
while not done:    
    if click <= 50:         
        i = 0
        while i < 25:
            if box[i].text == str(click):
                box[i].click()
                print(click)
                click += 1                
                break
            else:
                i += 1
    else:
        done = True                    
    
                
    




            
