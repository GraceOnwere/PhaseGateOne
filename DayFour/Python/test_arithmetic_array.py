from unittest import TestCase

import arithmetic_array

class ArithmeticArrayTest(TestCase):

    def test_that_i_have_an_array_and_a_number_returns_any_element_in_the_array_that_gives_that_number(self):

        array = [8,6,12,4,-2]
        
        number = 6

        actual = arithmetic_array.perform_operation(array,number)

        expected = [8, -2]

        self.assertEqual(actual,expected)

