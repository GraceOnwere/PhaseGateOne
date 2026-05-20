from unittest import TestCase

import facebook_like_system

class TestFacebookLikeSystem(TestCase):

    def test_that_one_person_likes_the_page(self):

        actual = facebook_like_system.check_like_text([])
    
        expected = '"no one likes this"'

        self.assertEqual(actual,expected)

    def test_that_two_people_like_the_page(self):

        actual = facebook_like_system.check_like_text(["Peter",])
