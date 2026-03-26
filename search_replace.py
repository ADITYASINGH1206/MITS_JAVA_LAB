import os

# This script searches for a line/string and replaces it with another across all files in the directory.
directory = r'c:\Users\ADITYA\Desktop\MITS\4thsem\JAVA'

search_text = input("Enter the line or text you want to find: ")
replace_text = input("Enter the replacement text: ")

files = [f for f in os.listdir(directory) if os.path.isfile(os.path.join(directory, f))]

for file_name in files:
    # Skip the script files themselves to avoid accidental modification
    if file_name in ['insert_info.py', 'search_replace.py']:
        continue
        
    file_path = os.path.join(directory, file_name)
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
            
        if search_text in content:
            new_content = content.replace(search_text, replace_text)
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(new_content)
            print(f"Updated {file_name}")
        else:
            # print(f"No match in {file_name}")
            pass
            
    except Exception as e:
        print(f"Error processing {file_name}: {e}")
