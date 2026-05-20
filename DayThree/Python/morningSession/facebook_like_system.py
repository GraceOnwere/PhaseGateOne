def check_like_text(array):
    if len(array) == 0:

        return f'"no one likes this"'

    if len(array) == 1:

        return f'"{array[0]} likes"'

    if len(array) == 2:

        return f'"{array[0]} and {array[1]} likes this"'

    if len(array) == 3:

        return f'"{array[0]}, {array[1]} and {array[2]} likes this"'

    if len(array) >= 4:


        return f'"{array[0]},{array[1]} and {len(array) - 2} others likes this"'


#print(check_like_text(["Peter","Mary","Grace","Miracle","Tonye"]))
